/* groovylint-disable CompileStatic, MethodReturnTypeRequired, NoDef */

def chekcDockercompose() {
    echo 'check docker'
    sh 'docker compose'
}

def checkComposeStatus() {
echo 'checking compose status'
script {
def exitStatus = sh script: 'docker-compose ps -q | xargs docker inspect -f '{{ .State.ExitCode }}' | grep -v '0$' | wc -l', returnStatus: true
if (exitStatus == 0) {
echo 'Docker-compose files ran successfully'
} else {
echo 'Docker-compose files failed to run'
// Send notification to relevant parties
}
}
}

return this

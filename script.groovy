/* groovylint-disable CompileStatic, MethodReturnTypeRequired, NoDef */
def runDockerCompose() {
    echo 'running docker compose'
    sh 'docker compose up -d'
}

def readLogs() {
    echo 'Read the logs'
    sh 'docker compose logs > logs.txt'
}

def checkLogs() {
    echo 'check logs'
    sh 'python app.py'
}

return this

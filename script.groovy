/* groovylint-disable CompileStatic, MethodReturnTypeRequired, NoDef */

def checkDocker() {
    echo 'check if docker is accessible or not'
    sh 'docker ps'
}

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

def stopDockerCompose() {
    echo 'stopping docker compose'
    sh 'docker compose down'
}

return this

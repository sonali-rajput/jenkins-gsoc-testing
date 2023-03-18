/* groovylint-disable-next-line CompileStatic, NoDef, VariableTypeRequired */
def gv
pipeline {
    agent any
    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }
        stage('check if docker is accessible or not') {
            steps {
                script {
                    gv.checkDocker()
                }
            }
        }
        stage('run docker compose') {
            steps {
                script {
                    gv.runDockerCompose()
                }
            }
        }
        stage('check container logs') {
            steps {
                script {
                    gv.checkLogs()
                }
            }
        }
    }
    post {
        always {
            script {
                gv.stopDockerCompose()
            }
        }
    }
}


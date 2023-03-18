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
        stage('read container logs') {
            steps {
                script {
                    gv.readLogs()
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

        stage('stop docker compose') {
            steps {
                echo "stop the containers"
            }
            post {
                always {
                    script {
                    gv.stopDockerCompose()
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
}

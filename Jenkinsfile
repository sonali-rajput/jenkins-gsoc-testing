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
        stage('check if docker is present') {
            steps {
                script {
                    gv.chekcDocker()
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
    }
}

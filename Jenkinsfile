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
        stage('check if docker compose is present') {
            steps {
                script {
                    gv.chekcDockercompose()
                }
            }
        }
        stage('check docker compose status') {
            steps {
                script {
                    gv.checkComposeStatus()
                }
            }
        }
    }
}

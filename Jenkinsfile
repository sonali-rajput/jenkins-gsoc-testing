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
                script {
                    gv.stopDockerCompose()
                }
            }
        }


        // stage('Build and test docker-compose files') {
        //     steps {
        //         sh 'sudo apt-get update && sudo apt-get install -y docker.io docker-compose'
        //         sh 'docker-compose up -d'
        //         sh 'docker-compose ps'
        //         script {
        //             def exitStatus = sh script: 'docker-compose ps -q | xargs docker inspect -f \'{{ .State.ExitCode }}\' | grep -v \'0$\' | wc -l', returnStatus: true
        //             if (exitStatus == 0) {
        //                 echo 'Docker-compose files ran successfully'
        //             } else {
        //                 echo 'Docker-compose files failed to run'
        //                 // Send notification to relevant parties
        //             }
        //         }
        //     }
        // }
    }
}

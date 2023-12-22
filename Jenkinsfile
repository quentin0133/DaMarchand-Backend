pipeline {
    agent any

    tools {
        maven "Maven 3.9.6"
    }

    stages {
        stage('Hello') {
            steps {
                script {
                    echo 'Hello World !'
                }
            }
        }

        stage('Maven Build') {
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build('damarchand-backend:latest')
                        bat "docker image prune -f"
                   }
                }
            }

        stage('Start Docker Container') {
            steps {
                script {
                    try {
                        bat "docker stop damarchand-backend"
                        bat "docker rm damarchand-backend"
                    } catch (Exception e) {
                       echo '404 Not Found : damarchand-backend'
                    }
                    bat "docker run --name damarchand-backend -d -p 9075:8080 damarchand-backend:latest damarchand_backend.jar"
                }
            }
        }
    }
}
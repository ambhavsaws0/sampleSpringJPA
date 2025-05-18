pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'example/springsamplejpa'
        GIT_COMMIT_SHORT = ''
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
                script {
                    GIT_COMMIT_SHORT = sh(script: 'git rev-parse --short HEAD', returnStdout: true).trim()
                }
            }
        }

        stage('Build with Gradle') {
            steps {
                sh './gradlew clean build -x test'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE}:${GIT_COMMIT_SHORT}")
                    docker.tag("${DOCKER_IMAGE}:${GIT_COMMIT_SHORT}", "${DOCKER_IMAGE}:latest")
                }
            }
        }

    }

    post {
        success {
            echo "Docker image ${DOCKER_IMAGE}:${GIT_COMMIT_SHORT} built successfully."
        }
    }
}

pipeline {
    agent any
    environment {
        DOCKER_IMAGE_NAME = 'scientific-calculator'
        GITHUB_REPO_URL = 'https://github.com/Paranoid-02/java-maven-project.git'
    }
    stages {
        stage('Checkout') {
            steps {
                script {
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }
        stage('Build and Test') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKER_IMAGE_NAME}", '.')
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        sh "docker tag ${DOCKER_IMAGE_NAME} paranoid02/scientific-calculator:latest"
                        sh "docker push paranoid02/scientific-calculator"
                    }
                }
            }
        }
        stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory'
                    )
                }
            }
        }
    }
}

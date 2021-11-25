pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                mvn clean install
            }
        }
        stage('Test') {
            steps {
                mvn test
            }
        }
        stage('Deploy') {
            steps {
                mvn deploy
            }
        }
    }
}
pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                maven : 'maven' {
                    sh 'mvn clean compile'
                }
            }
        }
    }
}
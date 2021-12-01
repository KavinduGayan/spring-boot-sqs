pipeline {
    agent any

    stages {
        stage ('build') {

            steps {
                    sh '${JAVA_HOME}'
                    sh '${MAVEN_HOME}'
                    sh 'mvn clean package'
            }
        }

        /* stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn deploy'
                }
            }
        } */
    }
}
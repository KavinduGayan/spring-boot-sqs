pipeline {
    agent any

    stages {
        stage ('build') {

            steps {
                    echo '${JAVA_HOME}'
                    echo '${MAVEN_HOME}'
                    echo 'mvn clean package'
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
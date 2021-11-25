pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk11'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
                    steps {
                    withMaven(maven : 'maven'){
                    sh "mvn -version"
                    }

                    }
                    post {
                        success {
                            junit 'target/surefire-reports/**/*.xml'
                        }
                    }
                }
    }
}
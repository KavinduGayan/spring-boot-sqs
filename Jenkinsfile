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
                    sh "mvn -version"
                    /* sh '''
                    export PATH=$PATH:M2_HOME/bin
                    mvn -Dmaven.test.failure.ignore=true install
                        ''' */
                    }
                    post {
                        success {
                            junit 'target/surefire-reports/**/*.xml'
                        }
                    }
                }
    }
}
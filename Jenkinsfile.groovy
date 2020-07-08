pipeline{
    agent any

    stages{
        stage('Get java version'){
            parallel {
                stage ('Echo'){
                    steps{
                        echo "Echo test"
                    }
                }
                stage('Unit Test'){
                    steps {
                        echo "Unit Test "
                        junit 'target/surefire-reports/*.xml'
                    }
                    post{
                        always{
                            archiveArtifacts artifacts:'target/jenk.jar'
                        }
                    }
                }
            }
        }

        
    }
}
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
                        junit '/src/test/java/org/sid/*.xml'
                    }
                }
            }
        }

        
    }
    
                    post{
                        always{
                            archiveArtifacts artifacts:'target/jenk.jar'
                        }
                    }
}
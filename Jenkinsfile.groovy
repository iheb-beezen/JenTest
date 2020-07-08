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
                stage('Java Version'){
                    steps {
                        echo "the version of java is : "
                        sh 'java -version'
                    }
                }
            }
        }

        
    }
}
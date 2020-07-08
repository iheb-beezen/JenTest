pipeline{
    agent any

    tools{
        JDK 'jdk'
    }
    stages{
        stage('Get java version'){
            steps{
                sh 'java -version'
            }
        }

        
    }
}
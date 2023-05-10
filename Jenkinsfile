pipeline{
    agent any

        tools {
        maven 'maven3.6'
    }
//spring mvc
    stages{
        stage('checkout'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'buddhanaveen', url: 'https://github.com/Naveen176/Assignment09B.git']]])
            }
        }
        stage('build'){
            steps{
               bat 'mvn clean package'
            }
        }
    }
}

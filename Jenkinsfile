pipeline {
    agent any

    stages {
        stage('Check out') {
            steps {
                echo 'Checking out'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('JaCoCo Report') {
            steps {
                jacoco()
            }
        }
        stage('Sonar Analysis') {
            steps {
                withSonarQubeEnv('ZensarCodeAnalysis'){
                bat 'mvn sonar:sonar'
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                
            }
        }
        stage('Push Doker Image to Doker Hub') {
            steps {
                
            }
        }
    }
}

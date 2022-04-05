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
                bat 'mvn clean package' //for windows
                //sh 'mvn clean package for linux
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
                bat 'docker build -t ash4697/test .'
            }
        }
        stage('Push Doker Image to Doker Hub') {
            steps {
                bat 'docker login -u username -p password'
                bat 'docker push ash4697/test'
            }
        }
    }
}

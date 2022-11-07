pipeline {
    agent any 

    stages {
        
        stage('Checkout GIT'){
            steps {
                echo 'Pulling...';
                git branch: 'louay', credentialsId: 'f839155e-8141-48dd-9dfe-117bd0753cba', url: 'https://github.com/Maher-Guerfali/Project-Achat.git'
            }
        }
        
        stage('Testing Maven Build'){
            steps {
                sh "mvn clean install"
            }
        }
        
        stage('Testing Maven Test'){
            steps {
                sh "mvn test"
            }
        }
    }
}

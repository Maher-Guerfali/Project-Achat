pipeline {
    agent any 
    
    stages {
        stage('GIT'){
            steps {
                echo 'Pulling...';
                git branch: 'leila', credentialsId: '6508bd54-4ccb-4882-bdd2-6bae7d354b65', url: 'https://github.com/Maher-Guerfali/Project-Achat.git'
            }
        }
        stage('CLEAN'){
            steps {
                sh "mvn clean install"
            }
        }
        stage('BUILD'){
            steps {
                sh "mvn package"
            }
            
        }
         stage('TEST'){
            steps {
                sh "mvn test"
            }
            
        }
        stage('SONAR'){
            steps {
                sh "mvn verify sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar"
            }
        }
        stage('NEXUS'){
            steps {
                sh "mvn deploy"
            }
        }
        stage('Login'){
            steps {
                sh "docker login -u reirav -p 24253537a"
            }
        }
        stage('Docker Build'){
            steps {
                sh "docker build -t reirav/springdevopsapp:1.0.SNAPSHOT ."
            }
        }
        stage('Docker push'){
            steps {
                sh "docker push reirav/springdevopsapp"
            }
        }
    }
}

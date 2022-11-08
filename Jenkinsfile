pipeline {
    agent any 

    stages {
        
        stage('Checkout GIT'){
            steps {
                echo 'Pulling...';
                git branch: 'louay', credentialsId: 'f839155e-8141-48dd-9dfe-117bd0753cba', url: 'https://github.com/Maher-Guerfali/Project-Achat.git'
            }
        }
        
        stage('Testing Maven Clean'){
            steps {
                sh "mvn clean"
            }
        }
        
        stage('Testing Maven Compile'){
            steps {
                sh "mvn compile"
            }
        }
        
        stage('Testing Maven Livrable'){
            steps {
                sh "mvn package"
            }
        }
        
        
        stage('Testing Maven Test'){
            steps {
                sh "mvn test"
            }
        }
        
        stage('Testing Sonar Test'){
            steps {
                sh "mvn verify sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar"
            }
        }
        
        stage('Testing Nexus Test'){
            steps {
                sh "mvn deploy"
            }
        }
        
         stage('Testing Docker Login'){
            steps {
                sh "docker login -u louaybader -p "
            }
        }
        
        stage('Testing Docker Build'){
            steps {
                sh "docker build -t louaybader/springdevopsapp:1.0.SNAPSHOT ."
            }
        }
        
        stage('Testing Docker Push'){
            steps {
                sh "docker push louaybader/springdevopsapp"
            }
        }
        
    }
}

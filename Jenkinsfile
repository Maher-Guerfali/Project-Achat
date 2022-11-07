pipeline {
    agent any 

    stages {
        
        stage('GIT'){
            steps {
                echo 'Pulling...';
                git branch: 'arbia', credentialsId: '666c4179-783f-41ec-9a54-3a618a1689b5', url: 'https://github.com/Maher-Guerfali/Project-Achat.git'
            }
        }
        
        stage('CLEAN'){
            steps {
                sh "mvn clean install"
            }
        }
        
        stage('PACKAGE'){
            steps {
                sh "mvn package"
            }
        }

        stage('TEST'){
            steps {
                sh "mvn test"
            }
        }
        
        stage('SONARQUBE'){
            steps {
                sh "mvn verify sonar:sonar -Dsonar.login=admin -Dsonar.password=strevana"
            }
        }
        
        stage('DOCKER'){
            steps {
                sh "docker login -u strevana -p 949788Ab@"
                sh "docker build -t strevana/devopsapp:1.0.SNAPSHOT ."
                sh "docker push strevana/devopsapp"
            }
        }      
        
    }
}

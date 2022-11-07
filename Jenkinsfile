pipeline {
    agent any 

    stages {
        
        stage('Checkout GIT'){
            steps {
                echo 'Pulling...';
                git branch: 'arbia', credentialsId: '666c4179-783f-41ec-9a54-3a618a1689b5', url: 'https://github.com/Maher-Guerfali/Project-Achat.git'
            }
        }
        
        stage('Clean Project'){
            steps {
                sh "mvn clean install"
            }
        }
        
        stage('Create Package'){
            steps {
                sh "mvn package"
            }
        }

        stage('Run Tests'){
            steps {
                sh "mvn test"
            }
        }
        
        stage('Create Docker image'){
            steps {
                sh "docker login -u strevana -p 949788Ab@"
                sh "docker build -t strevana/devopsapp:1.0.SNAPSHOT ."
                sh "docker push strevana/devopsapp"
            }
        }
        
        
    }
}

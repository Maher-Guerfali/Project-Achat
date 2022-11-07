pipeline {
    agent any 

    stages {
        
        stage('Checkout GIT'){
            steps {
                echo 'Pulling...';
                git branch: 'main',
                url:'https://github.com/Louay27/devops',
                credentialsId: 'f839155e-8141-48dd-9dfe-117bd0753cba';
            }
        }
        
        stage('Testing Maven'){
            steps {
                echo 'hello'
                sh "ls"
            }
        }
    }
}

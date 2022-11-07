pipeline {
    agent any 

    stages {
        
        stage('Checkout GIT'){
            steps {
                echo 'Pulling...';
                git branch: 'arbia', credentialsId: '666c4179-783f-41ec-9a54-3a618a1689b5', url: 'https://github.com/Maher-Guerfali/Project-Achat.git'
            }
        }
    }
}

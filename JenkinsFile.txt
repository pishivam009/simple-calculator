pipeline {
    agent {
        label 'RabinaWS'
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}

pipeline {
    agent any

    stages {

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t springboot-demo .'
            }
        }

        stage('Run Container') {
            steps {
                sh '''
                docker rm -f springboot-app || true
                docker run -d -p 8081:8080 --name springboot-app springboot-demo
                '''
            }
        }
    }

    post {
        success {
            echo "Application deployed at http://<EC2-IP>:8081"
        }
    }
}

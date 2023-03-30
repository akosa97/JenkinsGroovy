pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh 'npm install'
                sh 'npm run build'
            }
        }
        stage('Test') {
            steps {
                sh 'npm run test'
            }
        }
        stage('Deploy to Staging') {
            steps {
                sh 'echo "Deploying to staging..."'
                sh 'npm run deploy:staging'
            }
        }
        stage('Smoke Test') {
            steps {
                sh 'echo "Running smoke tests..."'
                sh 'npm run smoke:test'
            }
        }
        stage('Deploy to Production') {
            steps {
                sh 'echo "Deploying to production..."'
                sh 'npm run deploy:production'
            }
        }
    }
}

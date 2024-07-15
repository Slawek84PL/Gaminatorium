pipeline {
    agent any

    tools {
        gradle "gradle"
    }

    stages {
        stage('Build') {
            step {
                sh "gradle clean build -x test"
            }
        }
    }
}
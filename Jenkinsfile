pipeline {
    agent any

    tools {
        gradle "gradle"
    }

    stages {
        stage('Build') {
            steps {
                dir("gateway-balancer") {
                    sh "gradle clean build"
                }
            }
        }
    }
}
pipeline {
    agent any

    tools {
        gradle "gradle"
    }

    stages {
        stage('Build') {
            parallel {
                stage('Build Gateway Balancer') {
                    steps {
                        dir("gateway-balancer") {
                            sh "gradle clean build"
                        }
                    }
                }
                stage('Build Eureka Discovery') {
                    steps {
                        dir("eureka-discovery") {
                            sh "gradle clean build"
                        }
                    }
                }
            }
        }
    }
}
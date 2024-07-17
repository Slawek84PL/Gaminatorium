pipeline {
    agent any

    tools {
        gradle "gradle"
    }

    stages {
        stage('Clear workspace') {
            steps {
                deleteDir();
            }
        }

        stage('Build') {
            parallel {
//                 stage('Build Eureka Discovery') {
//                     steps {
//                         dir("eureka-discovery") {
//                             sh "gradle clean build"
//                         }
//                     }
//                 }
//                 stage('Build Gateway Balancer') {
//                     steps {
//                         dir("gateway-balancer") {
//                             sh "gradle clean build"
//                         }
//                     }
//                 }
                stage('Build Gaminatorium') {
                    steps {
                        dir("gaminatorium-main") {
                            sh "gradle clean build"
                        }
                    }
                }
            }
        }
    }
}
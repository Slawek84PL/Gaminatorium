pipeline {
    agent any

    tools {
        gradle "gradle"
    }

    stages {
        stage('Build') {
            steps {
                dir("gaminatorium-main") {
                    sh "./gradlew clean build"
                }
            }
        }
    }
}
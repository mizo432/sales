node {
   stage ('git clone'){
      git 'https://github.com/mizo432/sales.git'
   }

   stage ('clean'){
      sh './gradlew --daemon clean'
   }

   stage ('sales-externals :build'){
      sh './gradlew --daemon :sales-externals:build'
   }

   stage ('sales-core :build'){
      sh './gradlew --daemon :sales-core:build'
   }

   stage ('sales-adapter :build'){
      sh './gradlew --daemon :sales-adapter:build'
   }

   stage ('sales-web :build'){
      sh './gradlew --daemon :sales-web:build'
   }

   stage ('build'){
      sh './gradlew --daemon build'
   }

// JUnitテストレポートを保存
   stage ('copy test report'){
      step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])
   }

}
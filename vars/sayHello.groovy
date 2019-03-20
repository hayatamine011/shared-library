// vars/sayHello.groovy
def call(String name = 'human') {
  if ( name == "SUCCESS" ) {
// Any valid steps can be called from this code, just like in other // Scripted Pipeline
echo "Hello, ${name}."
        slackSend color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful"

  }}

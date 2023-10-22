#!groovy
def decidePipeline(Map configMap){
    application = configMap.get("application")
    // here we are getting nodeJSVM
    switch(application) {
        case 'nodeJSVM':
            echo "application is Node JS and VM based"
            nodeJSVMCI(configMap)
            break
        case 'JavaVM':
            echo "application is Java and VM based"
            javaVMCI(configMap)
            break
        default:
            error "Un recognised application"
            break
    }
}
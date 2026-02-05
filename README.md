Project Overview:

This is a java deployment project demonstrates deploying a containerized web application on Kubernetes  

Firstly, I have created a dockerfile and build an image from my java code. And pushed this image to my docker dockerhub 

Here in kuberenetes i have used this image in deploy.yml with 3 replicas and nodeport service is used service.yml, (Label - my-app)


## MS-SpringCloud-ConfigServer
<pre>
  Config Server is used to store the common key-value pairs as a properties/yaml file for all microservices.
</pre>
<pre>
  &#8594; No need of writing same/duplicate key-value pairs in multiple microservices
  &#8594; Modification of key - val easy processing (need not modify at multiple places)
  &#8594; This concept is used only for common key-val(not for all key-val)
</pre>
### Config server are two types
##### **A.External config server(default): place our properties/yaml file       repository(github) and link with our microservices.**
#####  **b.Native Config server : Place properties/yaml file inside same PC/System Drives (Folder System) for easy testing purpose (or still no repository URL is given)**
<pre>
  &#8594; Config server is application/project that must be created and configured by programmer, it runs by default onPORT:8888 and IP: localhost(127.0.0.1)
  &#8594; config server also contains one properties/yaml file, that behaves like LINK file ie it holds details of external config properties File/Native config properties file
  &#8594; **Every Microservices application should have config client dependency(no manual coding required,just add dependency). when we start our MS first config client gets executed and it will try to fetch data(key-val) from config server, that autoconfiguration gets executed, finally register with eureka.**
</pre>

#### FLOW AND EXECUTION FLOW OF THE SPRINGCLOUD-CONFIGDERVER
![Spring Cloud Config Server](https://github.com/rammolankula/MS-SpringCloud-ConfigServer/assets/53596726/b1f554e8-2852-4342-a6da-41aff94b9077)

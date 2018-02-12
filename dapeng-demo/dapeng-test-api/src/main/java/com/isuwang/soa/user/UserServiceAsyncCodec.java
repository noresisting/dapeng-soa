package com.isuwang.soa.user;
        import com.isuwang.soa.order.domain.serializer.*;import com.github.dapeng.soa.domain.serializer.*;import com.isuwang.soa.price.domain.serializer.*;import com.isuwang.soa.user.domain.serializer.*;import com.isuwang.soa.settle.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import com.github.dapeng.core.definition.SoaServiceDefinition;
        import com.github.dapeng.core.definition.SoaFunctionDefinition;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        import com.isuwang.soa.user.service.UserServiceAsync;
        /**
        * Autogenerated by Dapeng-Code-Generator (1.2.2)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *  @generated
        **/
        public class UserServiceAsyncCodec {

        
            public static class createUser_args {
            
                private com.isuwang.soa.user.domain.User user;
                public com.isuwang.soa.user.domain.User getUser(){
                return this.user;
              }
                public void setUser(com.isuwang.soa.user.domain.User user){
                this.user = user;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("user").append("\":").append(this.user == null ? "null" : this.user.toString()).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class createUser_result {

            
                  @Override
                  public String toString(){
                  return "{}";
                }
                
          }

            public static class CreateUser_argsSerializer implements BeanSerializer<createUser_args>{
            
      @Override
      public createUser_args read(TProtocol iprot) throws TException{

      createUser_args bean = new createUser_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
              com.isuwang.soa.user.domain.User elem0 = new com.isuwang.soa.user.domain.User();
        elem0=new com.isuwang.soa.user.domain.serializer.UserSerializer().read(iprot);
       bean.setUser(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(createUser_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createUser_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("user", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.isuwang.soa.user.domain.User elem0 = bean.getUser();
             new com.isuwang.soa.user.domain.serializer.UserSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(createUser_args bean) throws TException{
      
              if(bean.getUser() == null)
              throw new SoaException(SoaCode.NotNull, "user字段不允许为空");
            
                if(bean.getUser() != null)
                new com.isuwang.soa.user.domain.serializer.UserSerializer().validate(bean.getUser());
              
    }
    

            @Override
            public String toString(createUser_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class CreateUser_resultSerializer implements BeanSerializer<createUser_result>{
            @Override
            public createUser_result read(TProtocol iprot) throws TException{

              createUser_result bean = new createUser_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.VOID){
                    
      com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(createUser_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("createUser_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(createUser_result bean) throws TException{
      
    }
    

            @Override
            public String toString(createUser_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class createUser<I extends com.isuwang.soa.user.service.UserServiceAsync> extends SoaFunctionDefinition.Async<I, createUser_args, createUser_result>
            {
              public createUser()
              {
                super("createUser", new CreateUser_argsSerializer(),  new CreateUser_resultSerializer());
              }

              @Override
              public CompletableFuture<createUser_result> apply(UserServiceAsync iface, createUser_args createUser_args) throws SoaException
              {

                CompletableFuture<Void> result = (CompletableFuture<Void>) iface.createUser(createUser_args.user);

                return result.thenApply((Void) -> {
                  createUser_result res = new createUser_result();
                  
                  return res;
              });
              }

            }
          
            public static class getUserById_args {
            
                private Integer userId;
                public Integer getUserId(){
                return this.userId;
              }
                public void setUserId(Integer userId){
                this.userId = userId;
              }
              

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("userId").append("\":").append(userId).append(",");
    
                if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }

            public static class getUserById_result {

            
                  private com.isuwang.soa.user.domain.User success;
                  public com.isuwang.soa.user.domain.User getSuccess(){
                  return success;
                }

                  public void setSuccess(com.isuwang.soa.user.domain.User success){
                  this.success = success;
                }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":").append(this.success == null ? "null" : this.success.toString()).append(",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
          }

            public static class GetUserById_argsSerializer implements BeanSerializer<getUserById_args>{
            
      @Override
      public getUserById_args read(TProtocol iprot) throws TException{

      getUserById_args bean = new getUserById_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.I32){
               int elem0 = iprot.readI32();
       bean.setUserId(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(getUserById_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getUserById_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("userId", com.github.dapeng.org.apache.thrift.protocol.TType.I32, (short) 1));
            Integer elem0 = bean.getUserId();
            oprot.writeI32(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(getUserById_args bean) throws TException{
      
    }
    

            @Override
            public String toString(getUserById_args bean) { return bean == null ? "null" : bean.toString(); }

          }

            public static class GetUserById_resultSerializer implements BeanSerializer<getUserById_result>{
            @Override
            public getUserById_result read(TProtocol iprot) throws TException{

              getUserById_result bean = new getUserById_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
                    com.isuwang.soa.user.domain.User elem0 = new com.isuwang.soa.user.domain.User();
        elem0=new com.isuwang.soa.user.domain.serializer.UserSerializer().read(iprot);
       bean.setSuccess(elem0);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(getUserById_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getUserById_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 0));
            com.isuwang.soa.user.domain.User elem0 = bean.getSuccess();
             new com.isuwang.soa.user.domain.serializer.UserSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(getUserById_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
            
                if(bean.getSuccess() != null)
                new com.isuwang.soa.user.domain.serializer.UserSerializer().validate(bean.getSuccess());
              
    }
    

            @Override
            public String toString(getUserById_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class getUserById<I extends com.isuwang.soa.user.service.UserServiceAsync> extends SoaFunctionDefinition.Async<I, getUserById_args, getUserById_result>
            {
              public getUserById()
              {
                super("getUserById", new GetUserById_argsSerializer(),  new GetUserById_resultSerializer());
              }

              @Override
              public CompletableFuture<getUserById_result> apply(UserServiceAsync iface, getUserById_args getUserById_args) throws SoaException
              {

                CompletableFuture<com.isuwang.soa.user.domain.User> result = (CompletableFuture<com.isuwang.soa.user.domain.User>) iface.getUserById(getUserById_args.userId);

                return result.thenApply(( com.isuwang.soa.user.domain.User i) -> {
                  getUserById_result res = new getUserById_result();
                  res.setSuccess(i);
                  return res;
              });
              }

            }
          

        public static class getServiceMetadata_args {

          @Override
          public String toString() {
            return "{}";
          }
        }


        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }

          @Override
          public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
              stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
              stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

            return stringBuilder.toString();
          }
        }

        public static class GetServiceMetadata_argsSerializer implements BeanSerializer<getServiceMetadata_args> {

          @Override
          public getServiceMetadata_args read(TProtocol iprot) throws TException {

            getServiceMetadata_args bean =new getServiceMetadata_args();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }


          @Override
          public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_args bean) throws TException {}

          @Override
          public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
          }

        }

        public static class GetServiceMetadata_resultSerializer implements BeanSerializer<getServiceMetadata_result> {
          @Override
          public getServiceMetadata_result read(TProtocol iprot) throws TException {

            getServiceMetadata_result bean = new getServiceMetadata_result();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaCode.NotNull, "success字段不允许为空");
          }

          @Override
          public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        public static class getServiceMetadata<I extends com.isuwang.soa.user.service.UserServiceAsync> extends SoaFunctionDefinition.Async<I, getServiceMetadata_args, getServiceMetadata_result> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public CompletableFuture<getServiceMetadata_result> apply(I iface, getServiceMetadata_args args) {
            getServiceMetadata_result result = new getServiceMetadata_result();

           return CompletableFuture.supplyAsync(() -> {
            try (InputStreamReader isr = new InputStreamReader(UserServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.soa.user.service.UserService.xml"));
            BufferedReader in = new BufferedReader(isr)) {
              int len = 0;
              StringBuilder str = new StringBuilder("");
              String line;
              while ((line = in.readLine()) != null) {

                if (len != 0) {
                  str.append("\r\n").append(line);
                } else {
                  str.append(line);
                }
                len++;
              }
              result.success = str.toString();

            } catch (Exception e) {
              e.printStackTrace();
              result.success = "";
            }

            return result;
          });
          }

        }

        @SuppressWarnings("unchecked")
        public static class Processor<I extends com.isuwang.soa.user.service.UserServiceAsync> extends SoaServiceDefinition<com.isuwang.soa.user.service.UserServiceAsync>
        {

          public Processor(com.isuwang.soa.user.service.UserServiceAsync iface, Class<com.isuwang.soa.user.service.UserServiceAsync> ifaceClass)
          {
            super(iface, ifaceClass, buildMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends com.isuwang.soa.user.service.UserServiceAsync> java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> buildMap(java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> processMap)
          {
            
                processMap.put("createUser", new createUser());
              
                processMap.put("getUserById", new getUserById());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());
            return processMap;
          }
        }

      }
      
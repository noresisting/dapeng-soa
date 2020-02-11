/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.today.api.purchase.request;

        import java.util.Optional;
        import com.github.dapeng.org.apache.thrift.TException;
        import com.github.dapeng.org.apache.thrift.protocol.TCompactProtocol;
        import com.github.dapeng.util.TCommonTransport;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.1.1-final)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

        *

 更新单品推移成本请求

        **/
        public class UpdateSkuStockCostRequest{
        
            /**
            *

 计算成本的日期

            **/
            public Optional<String> dateTime = Optional.empty();
            public Optional<String> getDateTime(){ return this.dateTime; }
            public void setDateTime(Optional<String> dateTime){ this.dateTime = dateTime; }

            public Optional<String> dateTime(){ return this.dateTime; }
            public UpdateSkuStockCostRequest dateTime(Optional<String> dateTime){ this.dateTime = dateTime; return this; }
          
            /**
            *

 门店id

            **/
            public Optional<String> storeId = Optional.empty();
            public Optional<String> getStoreId(){ return this.storeId; }
            public void setStoreId(Optional<String> storeId){ this.storeId = storeId; }

            public Optional<String> storeId(){ return this.storeId; }
            public UpdateSkuStockCostRequest storeId(Optional<String> storeId){ this.storeId = storeId; return this; }
          
            /**
            *

 货号

            **/
            public Optional<String> skuNo = Optional.empty();
            public Optional<String> getSkuNo(){ return this.skuNo; }
            public void setSkuNo(Optional<String> skuNo){ this.skuNo = skuNo; }

            public Optional<String> skuNo(){ return this.skuNo; }
            public UpdateSkuStockCostRequest skuNo(Optional<String> skuNo){ this.skuNo = skuNo; return this; }
          

        public static byte[] getBytesFromBean(UpdateSkuStockCostRequest bean) throws TException {
          byte[] bytes = new byte[]{};
          TCommonTransport transport = new TCommonTransport(bytes, TCommonTransport.Type.Write);
          TCompactProtocol protocol = new TCompactProtocol(transport);

          new com.today.api.purchase.request.serializer.UpdateSkuStockCostRequestSerializer().write(bean, protocol);
          transport.flush();
          return transport.getByteBuf();
        }

        public static UpdateSkuStockCostRequest getBeanFromBytes(byte[] bytes) throws TException {
          TCommonTransport transport = new TCommonTransport(bytes, TCommonTransport.Type.Read);
          TCompactProtocol protocol = new TCompactProtocol(transport);
          return new com.today.api.purchase.request.serializer.UpdateSkuStockCostRequestSerializer().read(protocol);
        }

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append("\"").append("dateTime").append("\":\"").append(this.dateTime.isPresent()?this.dateTime.get():null).append("\",");
    stringBuilder.append("\"").append("storeId").append("\":\"").append(this.storeId.isPresent()?this.storeId.get():null).append("\",");
    stringBuilder.append("\"").append("skuNo").append("\":\"").append(this.skuNo.isPresent()?this.skuNo.get():null).append("\",");
    
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      
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
package com.today.api.purchase.response;

        import java.util.Optional;
        import com.github.dapeng.org.apache.thrift.TException;
        import com.github.dapeng.org.apache.thrift.protocol.TCompactProtocol;
        import com.github.dapeng.util.TCommonTransport;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.1.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

        *

 实时库存查询返回实体

        **/
        public class ListSkuStockByStoreCodeResponse{
        
            /**
            *

 库存详情

            **/
            public java.util.List<SkuStockItem> skuStockItemList = new java.util.ArrayList();
            public java.util.List<SkuStockItem> getSkuStockItemList(){ return this.skuStockItemList; }
            public void setSkuStockItemList(java.util.List<SkuStockItem> skuStockItemList){ this.skuStockItemList = skuStockItemList; }

            public java.util.List<SkuStockItem> skuStockItemList(){ return this.skuStockItemList; }
            public ListSkuStockByStoreCodeResponse skuStockItemList(java.util.List<SkuStockItem> skuStockItemList){ this.skuStockItemList = skuStockItemList; return this; }
          
            /**
            *

 库存总数
 @datatype(name="bigdecimal")

            **/
            public java.math.BigDecimal totalStockNum ;
            public java.math.BigDecimal getTotalStockNum(){ return this.totalStockNum; }
            public void setTotalStockNum(java.math.BigDecimal totalStockNum){ this.totalStockNum = totalStockNum; }

            public java.math.BigDecimal totalStockNum(){ return this.totalStockNum; }
            public ListSkuStockByStoreCodeResponse totalStockNum(java.math.BigDecimal totalStockNum){ this.totalStockNum = totalStockNum; return this; }
          
            /**
            *

 库存总售价

            **/
            public double totalStockSellingPrice ;
            public double getTotalStockSellingPrice(){ return this.totalStockSellingPrice; }
            public void setTotalStockSellingPrice(double totalStockSellingPrice){ this.totalStockSellingPrice = totalStockSellingPrice; }

            public double totalStockSellingPrice(){ return this.totalStockSellingPrice; }
            public ListSkuStockByStoreCodeResponse totalStockSellingPrice(double totalStockSellingPrice){ this.totalStockSellingPrice = totalStockSellingPrice; return this; }
          
            /**
            *

 分页数据

            **/
            public Optional<com.today.api.common.PageResponse> pageResponse = Optional.empty();
            public Optional<com.today.api.common.PageResponse> getPageResponse(){ return this.pageResponse; }
            public void setPageResponse(Optional<com.today.api.common.PageResponse> pageResponse){ this.pageResponse = pageResponse; }

            public Optional<com.today.api.common.PageResponse> pageResponse(){ return this.pageResponse; }
            public ListSkuStockByStoreCodeResponse pageResponse(Optional<com.today.api.common.PageResponse> pageResponse){ this.pageResponse = pageResponse; return this; }
          

        public static byte[] getBytesFromBean(ListSkuStockByStoreCodeResponse bean) throws TException {
          byte[] bytes = new byte[]{};
          TCommonTransport transport = new TCommonTransport(bytes, TCommonTransport.Type.Write);
          TCompactProtocol protocol = new TCompactProtocol(transport);

          new com.today.api.purchase.response.serializer.ListSkuStockByStoreCodeResponseSerializer().write(bean, protocol);
          transport.flush();
          return transport.getByteBuf();
        }

        public static ListSkuStockByStoreCodeResponse getBeanFromBytes(byte[] bytes) throws TException {
          TCommonTransport transport = new TCommonTransport(bytes, TCommonTransport.Type.Read);
          TCompactProtocol protocol = new TCompactProtocol(transport);
          return new com.today.api.purchase.response.serializer.ListSkuStockByStoreCodeResponseSerializer().read(protocol);
        }

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append("\"").append("skuStockItemList").append("\":").append(this.skuStockItemList).append(",");
    stringBuilder.append("\"").append("totalStockNum").append("\":").append(this.totalStockNum).append(",");
    stringBuilder.append("\"").append("totalStockSellingPrice").append("\":").append(this.totalStockSellingPrice).append(",");
    stringBuilder.append("\"").append("pageResponse").append("\":").append(this.pageResponse.isPresent()?this.pageResponse.get().toString():null).append(",");
    
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      
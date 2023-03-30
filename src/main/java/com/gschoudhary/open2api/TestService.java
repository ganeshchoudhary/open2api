//package com.gschoudhary.open2api;
//
//import okhttp3.*;
//
//import java.io.File;
//import java.io.IOException;
//
//public class TestService {
//    public static void main(String[] args) throws IOException {
//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
//        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials&scope=read write&client_secret=090e0205ee913508d65f54fc2103dd5e&client_id=partner-samavesh");
//        Request request = new Request.Builder()
//                .url("https://auth.uat1.kalfin.in/oauth/token")
//                .method("POST", body)
//                .addHeader("Cookie", "_ga=GA1.2.1026103175.1635847435")
//                .addHeader("Content-Type", "application/x-www-form-urlencoded")
//                .build();
//        Response response = client.newCall(request).execute();
////        ============= application/json
//
//        mediaType = MediaType.parse("application/json");
//        body = RequestBody.create(mediaType, "{\n    \"name\":\"ganesh\",\n    \"age\":26\n}");
//        request = new Request.Builder()
//                .url("localhost:8080/app/v1/one-api")
//                .method("POST", body)
//                .addHeader("code", "101")
//                .addHeader("type", "SYNC")
//                .addHeader("Content-Type", "application/json")
//                .build();
//        response = client.newCall(request).execute();
//
////        ---------------------xml
//        client = new OkHttpClient().newBuilder()
//                .build();
//        mediaType = MediaType.parse("application/xml");
//        body = RequestBody.create(mediaType, "<root>\n\t<name>ganesh</name>\n\t<age>26</age>\n</root>");
//        request = new Request.Builder()
//                .url("localhost:8080/app/v1/one-api")
//                .method("POST", body)
//                .addHeader("code", "101")
//                .addHeader("type", "SYNC")
//                .addHeader("Content-Type", "application/xml")
//                .build();
//        response = client.newCall(request).execute();
//
//
////        ================== multipart body
//
//        client = new OkHttpClient().newBuilder()
//                .build();
//        mediaType = MediaType.parse("text/plain");
//        body = new MultipartBody.Builder().setType(MultipartBody.FORM)
//                .addFormDataPart("name", "ganesh")
//                .addFormDataPart("file", "ETicket_NN2PZXIHPCFIRYNR2234.pdf",
//                        RequestBody.create(MediaType.parse("application/octet-stream"),
//                                new File("/home/ganesh/Downloads/ETicket_NN2PZXIHPCFIRYNR2234.pdf")))
//                .build();
//        request = new Request.Builder()
//                .url("localhost:8080/app/v1/one-api")
//                .method("POST", body)
//                .addHeader("code", "101")
//                .addHeader("type", "SYNC")
//                .build();
//        response = client.newCall(request).execute();
//
////         ==================== none
//        OkHttpClient client = new OkHttpClient().newBuilder()
//                .build();
//        MediaType mediaType = MediaType.parse("text/plain");
//        RequestBody body = RequestBody.create(mediaType, "");
//        Request request = new Request.Builder()
//                .url("localhost:8080/app/v1/one-api")
//                .method("POST", body)
//                .addHeader("code", "101")
//                .addHeader("type", "SYNC")
//                .build();
//        Response response = client.newCall(request).execute();
//
//
////    ============================ get=========================
//        client = new OkHttpClient().newBuilder()
//                .build();
//        mediaType = MediaType.parse("application/json");
//        body = RequestBody.create(mediaType, "{\n    \"sdd\":\"sdff\"\n}");
//        request = new Request.Builder()
//                .url("localhost:8080/app/health")
//                .method("GET", body)
//                .addHeader("Content-Type", "application/json")
//                .build();
//        response = client.newCall(request).execute();
//
//
//
//    }
//}

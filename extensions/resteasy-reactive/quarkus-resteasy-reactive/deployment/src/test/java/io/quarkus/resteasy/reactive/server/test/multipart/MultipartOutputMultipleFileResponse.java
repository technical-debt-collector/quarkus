package io.quarkus.resteasy.reactive.server.test.multipart;

import java.io.File;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.reactive.PartType;
import org.jboss.resteasy.reactive.RestForm;

public class MultipartOutputMultipleFileResponse {

    @RestForm
    String name;

    @RestForm
    @PartType(MediaType.APPLICATION_OCTET_STREAM)
    List<File> files;
}

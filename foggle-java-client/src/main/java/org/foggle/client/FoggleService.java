package org.foggle.client;

import org.foggle.core.dto.FeatureDto;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface FoggleService {
  @GET("api/client/features/enabled")
  Call<List<FeatureDto>> getEnabledFeatures();
}
package com.brainysoon.zkeps.config;

import com.brainysoon.zkeps.dao.DataConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by ken on 16-10-12.
 */
@Configuration
@Import(value = {DataConfig.class})
public class RootConfig {
}

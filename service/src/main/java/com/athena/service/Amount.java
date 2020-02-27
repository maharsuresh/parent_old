package com.athena.service;

import java.math.BigDecimal;

public interface Amount {
	BigDecimal getValue();
	Currency getCurrency();
}
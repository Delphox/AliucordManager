package com.aliucord.manager.installer.signing

import java.security.PrivateKey
import java.security.cert.X509Certificate

data class KeySet(
    val publicKey: X509Certificate,
    val privateKey: PrivateKey
)

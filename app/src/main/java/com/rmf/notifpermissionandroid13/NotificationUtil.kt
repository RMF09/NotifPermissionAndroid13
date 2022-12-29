package com.rmf.notifpermissionandroid13

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat

fun Context.showNotif() {
    val notifcation = NotificationCompat.Builder(applicationContext, "my_channel_id")
        .setSmallIcon(R.drawable.ic_launcher_foreground)
        .setContentTitle("Judul Notifikasi")
        .setContentText("Ini Deskripsi atau pesan")
        .build()
    val notificationManager =
        this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    notificationManager.notify(System.currentTimeMillis().toInt(), notifcation)
}
package com.example.lab_week_08.worker

import android.content.Context
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class ThirdWorker(
    context: Context, workerParams: WorkerParameters
) : Worker(context, workerParams) {

    override fun doWork(): Result {
        val id = inputData.getString(INPUT_DATA_ID)
        // Simulate some background task
        Thread.sleep(10000L)

        val outputData = Data.Builder()
            .putString(OUTPUT_DATA_ID, id)
            .build()
        return Result.success(outputData)
    }

    companion object {
        const val INPUT_DATA_ID = "inId3"
        const val OUTPUT_DATA_ID = "outId3"
    }
}

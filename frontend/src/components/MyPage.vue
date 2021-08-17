<template>

<v-data-table
    :headers="headers"
    :items="myPage"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'MyPage',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "orderId", value: "orderId" },
            { text: "paymentId", value: "paymentId" },
            { text: "orderStatus", value: "orderStatus" },
            { text: "paymentStatus", value: "paymentStatus" },
            { text: "reservationStatus", value: "reservationStatus" },
            { text: "reservationId", value: "reservationId" },
            { text: "customerName", value: "customerName" },
            { text: "roomType", value: "roomType" },
            { text: "cardNo", value: "cardNo" },
        ],
        myPage : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/mypages')

      this.myPage = temp.data._embedded.mypages;

    },
    methods: {
    }
  }
</script>

